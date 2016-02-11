#include "iostream"
using namespace std;

struct nodo
{
	int dato;
	nodo *sig;
};

class Pila
{
private:
	nodo *tope; //tope es la entrada a la pila

public:
	Pila();
	char meter(int valor);
	char sacar(int &valor);
	~Pila();
	void limpiarPila(); // quita todos los elementos de la pila
	int cimaPila(); //obtiene el elemento cima de la pila
	int longitudPila(); // ]Obtiene la cantidad de lementos de la pila
	void desplegarPila(); // muestra os elementos de la pila
};

Pila::Pila()
{
	tope = NULL;
}

Pila::~Pila()
{
	nodo *apunt;
	apunt = tope;
	while(tope!=NULL)
	{
		tope = apunt->sig;
		delete apunt;
		apunt = tope;
	}
}

char Pila::meter(int valor)
{
	nodo * nuevo;
	nuevo = new nodo;
	if(nuevo == NULL) return 0;
	else
	{
		nuevo->dato=valor;
		nuevo->sig = tope;
		tope = nuevo;
		return 1;
	}
}

char Pila::sacar(int &valor)
{
	nodo *apunt;
	apunt = tope;
	if(apunt == NULL) return 0;
	else
	{
		valor = apunt->dato;
		tope = tope->sig;
		delete apunt;
		return 1;
	}
}

void Pila::limpiarPila()
{
	nodo *apunt;
	apunt = tope;
	while(tope!=NULL)
	{
		tope = apunt->sig;
		delete apunt;
		apunt = tope;
	}
}

int Pila::cimaPila(){
	if(tope != NULL){return tope->dato;}
}

int Pila::longitudPila()
{
	int longi = 0;
	nodo *apunt, *aux;
	apunt = tope;
	aux = tope;
	while(aux!=NULL)
	{
		aux = apunt->sig;
		longi++;
		apunt = aux;
	}
	return longi;
}
void Pila::desplegarPila()
{
	nodo *apunt, *aux;
	apunt = tope;
	aux = tope;
	while(aux!=NULL)
	{
		cout<<aux->dato<<endl;
		aux = apunt->sig;		
		apunt = aux;
	}	
}



int main()
{
	Pila pila;
	int opcion,valor;

	do{

		cout<<"\n\t Estructura Pila \n Seleccione la opcion que desea realizar\n"<<endl;
		cout<<"1. Meter un elemento en la pila."<<endl;
		cout<<"2. Sacar un elemento de la pila."<<endl;
		cout<<"3. Mostrar la longuitud de la pila."<<endl;
		cout<<"4. Mostrar la cima de la pila"<<endl;
		cout<<"5. Limpiar la pila."<<endl;
		cout<<"6. Desplegar la pila."<<endl;
		cout<<"7. Salir."<<endl;
		cin>>opcion;
		
		

		if(opcion==1)
		{
			cout<<"Ingrese el elementos que desea meter en la pila"<<endl;
			cin>>valor;
			pila.meter(valor);

		}

		else if(opcion==2)
		{
			if(pila.sacar(valor)) cout<<"El elemento que se saco de la pila fue:"<<valor<<endl;
			else cout<<"La pila esta vacia"<<endl;
				
		}

		else if(opcion==3)
		{
			int longi;
			longi = pila.longitudPila();
			cout<<"La longitud de la pila es: \n"<<longi<<endl;
			
		}
		else if(opcion==4)
		{
			if(pila.cimaPila()) cout<<"el frente de la pila es: \n"<<pila.cimaPila()<<endl;
			else  cout<<"La pila esta vacia"<<endl;
			

		}
		else if(opcion==5)
		{
			pila.limpiarPila();
			cout<<"La pila se ha limpiado"<<endl;
		}

		else if(opcion==6)
		{
			cout<<"La pila es:"<<endl;
			pila.desplegarPila();			
			
		}

		else if(opcion==7) cout<<"Saliendo...";
		else cout<<"Escoja una opcion entre la 1 y la 7";

	}while(opcion!=7);
}
