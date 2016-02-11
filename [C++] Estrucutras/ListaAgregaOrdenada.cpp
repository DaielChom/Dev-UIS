#include "iostream"
using namespace System;
using namespace std;
struct nodo
{
	int dato;
	nodo *sig;
};

class lse
{
	private:
		nodo* inicial;
		nodo* buscarLista(int clave);
	public:
		lse();
		~lse();
		void agregar();
		void eliminar();
		void desplegarLista();		
};

lse::lse()
{
	inicial=NULL;
}

lse::~lse()
{
	nodo *apun;
	apun=inicial;
	while(apun!=NULL)
	{
		cout<<"borro"<<endl;
		inicial=apun->sig;
		delete apun;
		apun=inicial;
	}
	system("pause");
}

void lse::desplegarLista()
{
	if(inicial==NULL)
	{
		cout<<"La lista esta vacia"<<endl;
	}

	else
	{
		nodo *apunt;
		apunt = inicial;
		while(apunt != NULL)
		{
			cout<<apunt->dato<<endl;
			apunt = apunt->sig;
		}
	}
}

nodo *lse::buscarLista(int clave)
{
	

	nodo *anterior;
	anterior = NULL;
	if(clave <= inicial->dato) return anterior;
	
	else
	{
		anterior = inicial;
		
		
	

		while((anterior->sig!=NULL)&&(clave > anterior->sig->dato))
		

			
					
			anterior = anterior->sig;
		
		return anterior;
		
	}
}

void lse::agregar()
{
	nodo *nuevo, *anterior,*prueba;
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
			nuevo->sig =NULL;
		}

		else
		{
			//Agrega a una lista que tiene almenos un nodo
			anterior = buscarLista(nuevo->dato);

			if(anterior == NULL)
			{
				//agrega un nodo que queda de primero en una lista que no esta vacia
				if(inicial->dato==nuevo->dato){cout<<"El nodo a agregar ya existe"<<endl;}
				else{
				nuevo->sig = inicial;
				inicial = nuevo;
				}
			}		

			else
			{
				if(anterior->sig!=NULL)
				{
					
					//agrega un nodo que entre el primero y el ultimo
					if(nuevo->dato==anterior->sig->dato){cout<<"El nodo a agregar ya existe"<<endl;}
					else{
					nuevo->sig=anterior->sig;
					anterior->sig=nuevo;
					}
				}

				else
				{
					//agrega un nodo que queda de ultimo
					nuevo->sig=NULL;
					anterior->sig=nuevo;
				}
				
			}
			
		}

		cout<<"Desea agregar otro nodo? (s/n)"<<endl;
		cin>>resp;
		resp=tolower(resp);

	}while(resp=='s');
}

void lse::eliminar()
{
	int clave=0;
	nodo *anterior=NULL, *eliminar=NULL;

	cout<<"Escriba la clave del nodo que desea eliminar"<<endl;
	cin>>clave;

	

	if (inicial == NULL)
	{
		cout<<"Lista vacia"<<endl;
	}
	else
	{
		anterior = buscarLista(clave);
	if(anterior==NULL){
		if(clave!=inicial->dato){cout<<"no existe"<<endl;}
		else{
		
		anterior = inicial;
		inicial = anterior->sig;
		delete anterior;}
	}
		
	else{

		if(anterior->sig==NULL)
		{
			cout<<"no existe"<<endl;
		}
		else
		{
			eliminar=anterior->sig;
			if(eliminar->dato!=clave)
			{
				cout<<"no existe"<<endl;
			}
		
			else
			{
				
				anterior->sig= eliminar->sig;
		        delete eliminar;
			}
		}
	}
	}
}

 

void main()
{
	int opcion = 0;
	lse l;

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