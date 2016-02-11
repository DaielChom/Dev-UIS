#include "stdafx.h"
#include "iostream"
using namespace System;
using namespace std;
struct nodo
{
	int dato;
	nodo *sig;
};

class lista3
{
	private:
		nodo* inicial;
	public:
		lista3();
		void crear_lista(nodo *anterior, nodo *nuevo);
		void leer_nodo(nodo *nuevo);
		void imprime_nodo(nodo *apum);
		void reco_iter(nodo *apun);
		nodo* getInicial();
		~lista3();
};

lista3::lista3()
{
	inicial=NULL;
}

void lista3::crear_lista(nodo *anterior, nodo *nuevo)
{
	if(anterior==NULL)
	{
		nuevo->sig=inicial;
		leer_nodo(nuevo);
		inicial=nuevo;
	}
	else
	{
		
		nuevo->sig=anterior->sig;
		anterior->sig=nuevo;
		leer_nodo(nuevo);
	}
}
void lista3::leer_nodo(nodo *nuevo)
{
	cout<<"Entre valor del nodo"<<endl;
	cin>>nuevo->dato;
}
void lista3::imprime_nodo(nodo *apun)
{
	cout<<"El valor es: "<<apun->dato<<endl;
}
void lista3::reco_iter(nodo *apun)
{
	while(apun!=NULL)
	{
		imprime_nodo(apun);
		apun = apun->sig;
	}
}
nodo* lista3::getInicial()
{
	return inicial;
}



lista3::~lista3()
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

void main()
{
    nodo *anterior, *nuevo,*apun;
	char resp;
	lista3 l;
	anterior=NULL;
	do{
	
		nuevo =new nodo;
		l.crear_lista(anterior, nuevo);
		anterior=nuevo;
		cout<<"Desea crear otro nodo? (s/n)"<<endl;
		cin>>resp;
		resp=tolower(resp);
	}while(resp!='n');
	//inicio del recorrido de la lista
	apun=l.getInicial();
	l.reco_iter(apun);
}

