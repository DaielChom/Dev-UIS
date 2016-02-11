 #include "iostream"
using namespace System;
using namespace std;
struct nodo
{
	int clave;
	nodo *ant;
	nodo *sig;
};

class ldec
{
	private:
		nodo* inicial;
		nodo* buscarLista(int clave);
	public:
		ldec();
		~ldec();
		void agregar();
		void eliminar();
		void desplegarLista();	
		nodo* buscarUltimo();
};

ldec::ldec()
{
	inicial=NULL;
}

ldec::~ldec()
{
	nodo* elimina, *apun;
	apun = inicial;
	if(inicial == NULL){delete inicial;}
	else{
	do
		{
			cout<<"borro"<<endl;
			elimina = apun;
			apun = apun->sig;
			delete elimina;

		}while(apun != inicial);
	}
	system("pause");
}

void ldec::desplegarLista()
{
	int respuesta;
	nodo *apunt, *ultimo;
	if(inicial==NULL)
	{
		cout<<"La lista esta vacia"<<endl;
	}
	else
	{
		cout<<"Digite 1: para desplegar en sentido horario"<<endl;
		cout<<"       2: para desplegar en sentido anti horario"<<endl;
		cin>>respuesta;
		if(respuesta == 1)
		{
			apunt=inicial;
			do
			{
				cout<<apunt->clave<<" ";
				apunt = apunt->sig;
			}while(apunt!=inicial);
		}
		else
		{
			apunt = buscarUltimo();
			ultimo = buscarUltimo();
			do
			{
				cout<<apunt->clave<<" ";
				apunt = apunt->ant;
			}while(apunt!=ultimo);
		}
	}
}

nodo *ldec::buscarLista(int clave)
{
	

	nodo *anterior;
	anterior = NULL;
	if(clave <= inicial->clave) return anterior;
	
	else
	{
		anterior = inicial;	

		while(anterior->sig!=inicial && clave > anterior->sig->clave) 	anterior = anterior->sig;
		
		return anterior;		
	}
}

void ldec::agregar()
{
	nodo *nuevo, *anterior;
	char resp;
	do
	{
		nuevo = new nodo();
		cout<<"Entre la dato del nodo a agregar"<<endl;
		cin>>nuevo->clave;
		

		if(inicial==NULL)
		{
			//Agrega el primer nodo a la lista
			inicial = nuevo;
			nuevo->ant =nuevo;
			nuevo->sig =nuevo;
		}

		else
		{
			//Agrega a una lista que tiene almenos un nodo
			anterior = buscarLista(nuevo->clave);
			if(anterior == NULL)
			{
				//agrega un nodo que queda de primero en una lista que no esta vacia
				if(inicial->clave==nuevo->clave)
				{
					cout<<"El nodo a agregar ya existe"<<endl;
				}
				else
				{
					inicial->ant->sig=nuevo;
					nuevo->ant = inicial->ant;
					nuevo->sig = inicial;					
					inicial->ant=nuevo;
					inicial = nuevo;
				}
			}		

			else
			{					
					//agrega un nodo que entre el primero y el ultimo
					if(nuevo->clave==anterior->sig->clave)
					{
						cout<<"El nodo a agregar ya existe"<<endl;
					}

					else
					{
						anterior->sig->ant=nuevo;
						nuevo->sig=anterior->sig;
						nuevo->ant = anterior;
						anterior->sig=nuevo;
					}			
				
			}
			
		}

		cout<<"Desea agregar otro nodo? (s/n)"<<endl;
		cin>>resp;
		resp=tolower(resp);

	}while(resp=='s');
}

void ldec::eliminar()
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
			if(clave==inicial->clave)
			{
				if(inicial->sig==inicial)
				{
					//elimina el primer y unico nodo de la lista
					inicial = NULL;
				}

				else
				{
					//eliimna el primer nodo de una lista no vacia
					ultimo = buscarUltimo();
					elimina = inicial;
					inicial = elimina->sig;
					inicial->ant= ultimo;
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
			//elimina algun nodo que no sea el primero de la lista
			if(clave==anterior->sig->clave)
			{
				if(anterior->sig==buscarUltimo())
				{
					elimina = buscarUltimo();
					anterior->sig =elimina->sig;
					inicial->ant =anterior;
					delete elimina;
				}
				else
				{
				elimina = anterior->sig;
				anterior->sig->sig->ant=anterior;
				anterior->sig =elimina->sig;
				
				
				delete elimina;	}			
			}

			else
			{
				cout<<"El nodo a eliminar no existe"<<endl;
			}
		}
	}

}

nodo *ldec::buscarUltimo()
{
	return inicial->ant;
}


void main()
{
	int opcion = 0;
	ldec listaUno;
	
	do{
		
		system("cls");
		cout<<"LISTA QUE AGREGA EN ORDEN ASCENDENTE"<<endl;
		cout<<"1. Agregar nodo a una Lista"<<endl;
		cout<<"2. Eliminar Nodo de una lista"<<endl;
		cout<<"3. Desplegar Lista"<<endl;
		cout<<"4. Salir"<<endl;
		cout<<"Agrege el numero de la opcion que desea realizar."<<endl;
		cin>>opcion;
		system("cls");
		
		if(opcion == 1)	listaUno.agregar();
		if(opcion == 2) listaUno.eliminar();	
		if(opcion == 3)	listaUno.desplegarLista();
		
		flushall();
		getchar();
	
	}while(opcion!=4);	
	
}