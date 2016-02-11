#include "iostream"
using namespace System;
using namespace std;

struct nodo
{
	int dato;
	nodo *sig;
};

class Fila
{

private:
	nodo *frente;
	nodo *final;

public: 
	Fila();
	char meter(int valor);
	char sacar(int &valor);
	~Fila();
	void limpiarFila(); //Quita todos los elementos de la fila
	int frenteFila(); //Obtiene el lelemneto del frente de la lista
	int longitudFila();//obtiene la cantidad de elementos de la fila
	void desplegarFila(); //muestrea los elenmetos de la fila
};

Fila::Fila()
{
	frente = NULL;
	final = NULL;
}

Fila::~Fila()
{
	nodo *apunt;
	apunt = frente;
	while(frente!=NULL)
	{
		frente = apunt->sig;
		delete apunt;
		apunt = frente;
	}
}

char Fila::meter(int valor)
{
	nodo *nuevo;
	nuevo = new nodo;
	if(nuevo == NULL) return 0;
	else
	{
		nuevo->dato = valor;
		if(final== NULL) frente = nuevo;
		else final->sig = nuevo;
		nuevo->sig = NULL;
		final = nuevo;
		return 1;
	}
}

char Fila::sacar(int &valor)
{
	nodo *apunt;
	apunt = frente;
	if(apunt == NULL) return 0;
	else
	{
		valor = apunt->dato;
		if(frente->sig == NULL)
		{
			frente = NULL;
			final = NULL;
		}
		else frente = apunt->sig;
		delete apunt;
		return 1;
	}
}

void Fila::limpiarFila()
{
	nodo *apunt;
	apunt = frente;
	while(frente!=NULL)
	{
		frente = apunt->sig;
		delete apunt;
		apunt = frente;
	}
}

int Fila::longitudFila()
{
	int longi = 0;
	nodo *apunt, *aux;
	apunt = frente;
	aux = frente;
	while(aux!=NULL)
	{
		aux = apunt->sig;
		longi++;
		apunt = aux;
	}
	return longi;
}

int Fila::frenteFila()
{
	if(frente==NULL)return NULL;
	else	return frente->dato;
}

void Fila::desplegarFila()
{
	nodo *apunt, *aux;
	apunt = frente;
	aux = frente;
	while(aux!=NULL)
	{
		cout<<aux->dato<<endl;
		aux = apunt->sig;		
		apunt = aux;
	}	
}

void main()
{
	Fila fila;
	int opcion,valor;

	do{

		system("cls");
		cout<<"\n\t Estructura Fila \n Seleccione la opcion que desea realizar\n"<<endl;
		cout<<"1. Meter un elemento en la fila."<<endl;
		cout<<"2. Sacar un elemento de la fila."<<endl;
		cout<<"3. Mostrar la longuitud de la fila."<<endl;
		cout<<"4. Mostrar el frente de la fila"<<endl;
		cout<<"5. Limpiar la fila."<<endl;
		cout<<"6. Desplegar la fila."<<endl;
		cout<<"7. Salir."<<endl;
		cin>>opcion;
		system("cls");
		

		if(opcion==1)
		{
			cout<<"Ingrese el elementos que desea meter en la fila"<<endl;
			cin>>valor;
			fila.meter(valor);

		}

		else if(opcion==2)
		{
			if(fila.sacar(valor)) cout<<"El elemento que se saco de la fila fue:"<<valor<<endl;
			else cout<<"La fila esta vacia"<<endl;
			flushall();
			getchar();			
		}

		else if(opcion==3)
		{
			int longi;
			longi = fila.longitudFila();
			cout<<"La longitud de la fila es: \n"<<longi<<endl;
			flushall();
			getchar();	

		}
		else if(opcion==4)
		{
			if(fila.frenteFila()) cout<<"el frente de la fila es: \n"<<fila.frenteFila()<<endl;
			else  cout<<"La fila esta vacia"<<endl;
			flushall();
			getchar();

		}
		else if(opcion==5)
		{
			fila.limpiarFila();
			cout<<"La fila se ha limpiado"<<endl;
			flushall();
			getchar();
		}

		else if(opcion==6)
		{
			cout<<"La fila es:"<<endl;
			fila.desplegarFila();			
			flushall();
			getchar();

		}

		else if(opcion==7) cout<<"Saliendo...";
		else cout<<"Escoja una opcion entre la 1 y la 7";

	}while(opcion!=7);

}