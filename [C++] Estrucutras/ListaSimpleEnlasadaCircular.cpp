#include "iostream"
using namespace System;
using namespace std;

struct nodo
{
	int dato;
	nodo *sig;
};

class lsec
{
	private:
		nodo* inicial;
		nodo* buscarLista(int clave);
		nodo* buscarUltimo();
	public:
		lsec();
		~lsec();
		void agregar();
		void eliminar();
		void desplegarLista();		
};

lsec::lsec()
{
	inicial=NULL;
}

lsec::~lsec()
{
	nodo* elimina, *apun;
	apun = inicial;
	do
		{
			cout<<"borro"<<endl;
			elimina = apun;
			apun = apun->sig;
			delete elimina;

		}while(apun != inicial);

		_flushall();		
		getchar();
}

void lsec::desplegarLista()
{
	nodo *apunt;
	if(inicial==NULL)
	{
		cout<<"La lista esta vacia"<<endl;
	}

	else
	{		
		apunt = inicial;
		
		do
		{
			cout<<apunt->dato<<" ";
			apunt = apunt->sig;
		}while(apunt != inicial);
	}
	cout<<endl;
}

nodo *lsec::buscarUltimo()
{
	nodo *ultimo;
	ultimo = inicial;
	while(ultimo->sig!=inicial)ultimo=ultimo->sig;
	return ultimo;
}

nodo *lsec::buscarLista(int clave)
{
	nodo *anterior;
	anterior = NULL;

	if(clave <= inicial->dato) return anterior;
	
	else
	{
		anterior = inicial;
		while((anterior->sig!=inicial)&&(clave > anterior->sig->dato)) 	anterior = anterior->sig;
		return anterior;
	}
}

void lsec::agregar()
{
	nodo *nuevo, *anterior;
	char resp;
	do
	{
		nuevo = new nodo();
		cout<<"Entre la clave del nodo a agregar"<<endl;
		cin>>nuevo->dato;

		if(inicial==NULL)
		{
			//Agrega el primer nodo a la lista
			inicial = nuevo;
			nuevo->sig =nuevo;
		}

		else
		{
			//Agrega a una lista que tiene almenos un nodo
			anterior = buscarLista(nuevo->dato);

			if(anterior == NULL)
			{
				//agrega un nodo que queda de primero en una lista que no esta vacia
				if(inicial->dato==nuevo->dato)
				{
					cout<<"El nodo a agregar ya existe"<<endl;
				}

				else
				{
					nodo* ultimo;
					ultimo = buscarUltimo();
					ultimo->sig = nuevo;
					nuevo->sig = inicial;
					inicial = nuevo;
				}
			}		

			else
			{
				//agrega un nodo que entre el primero y el ultimo
				if(nuevo->dato==anterior->sig->dato)
				{
					cout<<"El nodo a agregar ya existe"<<endl;
				}
				
				else
					{
						nuevo->sig=anterior->sig;
						anterior->sig=nuevo;
					}
				}
			}
		cout<<"Desea agregar otro nodo? (s/n)"<<endl;
		cin>>resp;
		resp=tolower(resp);
	}while(resp=='s');
}

void lsec::eliminar()
{
	int clave;
	nodo *anterior, *elimina, *ultimo;
	if(inicial==NULL)
	{
		cout<<"La lista esta vacia"<<endl;
	}
	else
	{
		cout<<"ingrese la clave del nodo que desea eliminar"<<endl;
		cin>>clave;
		anterior = buscarLista(clave);
		if(anterior==NULL)
		{
			if(clave==inicial->dato)
			{
				if(inicial->sig==inicial)
				{
					inicial = NULL;
				}
				else{
				ultimo = buscarUltimo();
				elimina = inicial;
				inicial = elimina->sig;
				ultimo->sig=inicial;
				delete elimina;
				
				}
			}
			else
			{
				cout<<"El nodo a eliminar no existe"<<endl;
			}
		}
		else
		{
			if(clave==anterior->sig->dato)
			{
				
				elimina = anterior->sig;
				anterior->sig =elimina->sig;
				delete elimina;
				
			}
			else
			{
				cout<<"El nodo a eliminar no existe"<<endl;
			}
		}
	}

} 

void main()
{
	int opcion = 0;
	lsec l;

	do{
		system("cls");
		cout<<"LISTA QUE AGREGA EN ORDEN ASCENDENTE"<<endl;
		cout<<"1. Agregar Lista"<<endl;
		cout<<"2. Eliminar Nodo"<<endl;
		cout<<"3. Desplegar Lista"<<endl;
		cout<<"4. Salir"<<endl;
		cout<<"Agrege el numero de la opcion que desea realizar."<<endl;
		cin>>opcion;
		system("cls");
		
		if(opcion == 1){l.agregar(); }
		if(opcion == 2){l.eliminar();}
		if(opcion == 3){l.desplegarLista();}
		
		_flushall();
		getchar();
	
	}while(opcion!=4);
	
	
}