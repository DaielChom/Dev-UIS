 #include "iostream"
using namespace System;
using namespace std;
struct nodo
{
	int dato;
	int clave;
	nodo *ant;
	nodo *sig;
};

class lde
{
	private:
		nodo* inicial;
		nodo* buscarLista(int clave);
	public:
		lde();
		~lde();
		void agregar();
		void eliminar();
		void desplegarLista();	
		nodo* getInicial();
		void setInicial(nodo* ante, int claves, int datos,nodo* sigui);
		void agregarSumatoria(int clave,int dato);
};

lde::lde()
{
	inicial=NULL;
}

lde::~lde()
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

void lde::desplegarLista()
{
	if(inicial==NULL)
	{
		cout<<"La lista esta vacia"<<endl;
	}

	else
	{
		nodo *apunt;
		apunt = inicial;
		cout<<"Lista:\n Clave - Dato"<<endl;
		while(apunt != NULL)
		{
			cout<<apunt->clave<<"-"<<apunt->dato<<endl;
			apunt = apunt->sig;
		}
	}
}

nodo *lde::buscarLista(int clave)
{
	

	nodo *anterior;
	anterior = NULL;
	if(clave <= inicial->clave) return anterior;
	
	else
	{
		anterior = inicial;	

		while((anterior->sig!=NULL)&&(clave > anterior->sig->clave)) 	anterior = anterior->sig;
		
		return anterior;		
	}
}

void lde::agregar()
{
	nodo *nuevo, *anterior;
	char resp;
	do
	{
		nuevo = new nodo();
		cout<<"Entre la clave del nodo a agregar"<<endl;
		cin>>nuevo->clave;
		cout<<"Entre el dato del nodo a agregar"<<endl;
		cin>>nuevo->dato;

		if(inicial==NULL)
		{
			//Agrega el primer nodo a la lista
			inicial = nuevo;
			nuevo->ant =NULL;
			nuevo->sig =NULL;
		}

		else
		{
			//Agrega a una lista que tiene almenos un nodo
			anterior = buscarLista(nuevo->clave);

			if(anterior == NULL)
			{
				//agrega un nodo que queda de primero en una lista que no esta vacia
				if(inicial->clave==nuevo->clave){cout<<"El nodo a agregar ya existe"<<endl;}
				else{
				nuevo->sig = inicial;
				nuevo->ant = inicial->ant;
				inicial->ant=nuevo;
				inicial = nuevo;
				}
			}		

			else
			{
				if(anterior->sig!=NULL)
				{
					
					//agrega un nodo que entre el primero y el ultimo
					if(nuevo->clave==anterior->sig->clave){cout<<"El nodo a agregar ya existe"<<endl;}
					else{
					nuevo->sig=anterior->sig;
					nuevo->ant = anterior;
					anterior->sig->ant=nuevo;
					anterior->sig=nuevo;
					}
				}

				else
				{
					//agrega un nodo que queda de ultimo
					nuevo->sig=anterior->sig;
					nuevo->ant=anterior;
					anterior->sig=nuevo;
				}
				
			}
			
		}

		cout<<"Desea agregar otro nodo? (s/n)"<<endl;
		cin>>resp;
		resp=tolower(resp);

	}while(resp=='s');
}

void lde::agregarSumatoria(int clave, int dato){
	
	nodo *nuevo, *anterior;
	
		nuevo = new nodo();
		nuevo->clave = clave;
		nuevo->dato = dato;
		if(inicial==NULL)
		{
			//Agrega el primer nodo a la lista
			inicial = nuevo;
			nuevo->ant =NULL;
			nuevo->sig =NULL;
		}

		else
		{
			//Agrega a una lista que tiene almenos un nodo
			anterior = buscarLista(nuevo->clave);

			if(anterior == NULL)
			{
				//agrega un nodo que queda de primero en una lista que no esta vacia
				if(inicial->clave==nuevo->clave){cout<<"El nodo a agregar ya existe"<<endl;}
				else{
				nuevo->sig = inicial;
				nuevo->ant = inicial->ant;
				inicial->ant=nuevo;
				inicial = nuevo;
				}
			}		

			else
			{
				if(anterior->sig!=NULL)
				{
					
					//agrega un nodo que entre el primero y el ultimo
					if(nuevo->clave==anterior->sig->clave){cout<<"El nodo a agregar ya existe"<<endl;}
					else{
					nuevo->sig=anterior->sig;
					nuevo->ant = anterior;
					anterior->sig->ant=nuevo;
					anterior->sig=nuevo;
					}
				}

				else
				{
					//agrega un nodo que queda de ultimo
					nuevo->sig=anterior->sig;
					nuevo->ant=anterior;
					anterior->sig=nuevo;
				}
				
			}
			
		}	
	
}



void lde::eliminar()
{
	int clave=0;
	nodo *anterior=NULL, *eliminar=NULL;

	cout<<"Escriba la clave del nodo que desea eliminar"<<endl;
	cin>>clave;	

	//comprueba si la lista esta vacia
	if (inicial == NULL)
	{
		cout<<"Lista vacia"<<endl;
	}

	else
	{

		anterior = buscarLista(clave);

		//elimina el primer nodo de la lista
		if(anterior==NULL)
			{
				if(clave!=inicial->clave)
				{
					cout<<"no existe"<<endl;
				}
				else
				{
					anterior = inicial;
					inicial = anterior->sig;
					if(inicial!=NULL){inicial->ant=NULL;}
					delete anterior;
				}
		}

		//elimina nodo algun nodo de la lista que no sea el prmiero
		else
			{
				if(anterior->sig==NULL)
				{
					cout<<"no existe"<<endl;
				}
				else
				{
					eliminar=anterior->sig;
					if(eliminar->clave!=clave)
					{
						cout<<"no existe"<<endl;
					}
					else
					{
						anterior->sig= eliminar->sig;
							if(anterior->sig!=NULL){anterior->sig->ant=anterior;}
						delete eliminar;
					}
				}
		}
	}
}

nodo *lde::getInicial()
{
	return inicial;
}

void lde::setInicial(nodo* ante, int claves, int datos,nodo* sigui)
{
	inicial->ant=ante;
	inicial->clave = claves;
	inicial ->dato = datos;
	inicial ->sig = sigui;
}

 

void main()
{
	int opcion = 0,queLista;
	lde listaUno, listaDos, listaSuma;
	nodo *aux, *aux2;
	
	

	do{
		
		system("cls");
		cout<<"LISTA QUE AGREGA EN ORDEN ASCENDENTE"<<endl;
		cout<<"1. Agregar nodo a una Lista"<<endl;
		cout<<"2. Eliminar Nodo de una lista"<<endl;
		cout<<"3. Desplegar Lista"<<endl;
		cout<<"4. Sumar Listas"<<endl;
		cout<<"5. Salir"<<endl;
		cout<<"Agrege el numero de la opcion que desea realizar."<<endl;
		cin>>opcion;
		system("cls");
		
		if(opcion == 1)
		{	
			cout<<"¿A que lista desea agregarle un nodo? \n 1. Lista Uno. \n 2. Lista Dos. "<<endl;
			cin>>queLista;
			if(queLista==1){listaUno.agregar();}
			else if(queLista==2){listaDos.agregar();}
			else{cout<<"A";}
			
			
		}
		if(opcion == 2)
		{
			cout<<"¿A que lista desea eliminarle un nodo? \n 1. Lista Uno. \n 2. Lista Dos. "<<endl;
			cin>>queLista;
			if(queLista==1){listaUno.eliminar();}
			if(queLista==2){listaDos.eliminar();}
			
		
		}
		if(opcion == 3)
		{
			cout<<"Que lista desea desplegar? \n 1. Lista Uno. \n 2. Lista Dos. "<<endl;
			cin>>queLista;
			if(queLista==1){listaUno.desplegarLista();}
			if(queLista==2){listaDos.desplegarLista();}
		}
		
		if(opcion == 4)
		{	
			
			
			if(listaUno.getInicial()==NULL || listaDos.getInicial()==NULL)
			{
				if(listaUno.getInicial()==NULL && listaDos.getInicial()!=NULL)
				{					
					listaSuma= listaDos;
				}
				if(listaUno.getInicial()!=NULL && listaDos.getInicial()==NULL)
				{					
					listaSuma= listaUno;
				}
				else
				{
					cout<<"las listas estan vacias"<<endl;
				}
			}
			else
			{
				
				aux =listaUno.getInicial();
	      
				do{
					  aux2= listaDos.getInicial();
					do
					{
						if(aux->clave!=aux2->clave)
						{
							aux2=aux2->sig;
							if(aux2==NULL)
							{
								listaSuma.agregarSumatoria(aux->clave,aux->dato);
								
							}
						}
						else
						{
							listaSuma.agregarSumatoria(aux->clave,(aux2->dato+aux->dato));
							aux2=NULL;
						}

					}while(aux2!=NULL);	
					aux =aux->sig;
				}while(aux!=NULL);







				aux2 =listaDos.getInicial();
	      
				do{
					  aux= listaUno.getInicial();
					do
					{
						if(aux2->clave!=aux->clave)
						{
							aux=aux->sig;
							if(aux==NULL)
							{
								listaSuma.agregarSumatoria(aux2->clave,aux2->dato);
								
							}
						}
						else
						{
							listaSuma.agregarSumatoria(aux2->clave,(aux->dato+aux2->dato));
							aux=NULL;
						}

					}while(aux!=NULL);	
					aux2 =aux2->sig;
				}while(aux2!=NULL);
				
				
								

				
			}
			listaSuma.desplegarLista();
		}

		
		flushall();
		getchar();
	
	}while(opcion!=5);
	
	
}