#include "stdafx.h"
#include "iostream"
using namespace System;
using namespace std;
struct nodo
{
	int dato;
	nodo *sig;
};

class lista4
{
	private:
		nodo* inicial;
	public:
		lista4();
		void crear_lista(nodo *anterior, nodo *nuevo);
		void leer_nodo(nodo *nuevo);
		void imprime_nodo(nodo *apum);
		void reco_recur(nodo *apun);
		nodo* getInicial();
		~lista4();
};

lista4::lista4()
{
	inicial=NULL;
}

void lista4::crear_lista(nodo *anterior, nodo *nuevo)
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

void lista4::leer_nodo(nodo *nuevo)
{
	cout<<"Entre valor del nodo"<<endl;
	cin>>nuevo->dato;
}

void lista4::imprime_nodo(nodo *apun)
{
	cout<<"El valor es: "<<apun->dato<<endl;
}

void lista4::reco_recur(nodo *apun)
{
	if(apun!=NULL){
		imprime_nodo(apun);
		reco_recur(apun->sig);
	}
	
}

nodo* lista4::getInicial()
{
	return inicial;
}

lista4::~lista4()
{
	nodo *apun;
	apun=inicial;
	while(apun!=NULL)
	{
		//cout<<"borro"<<endl;
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
	lista4 l;
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
	l.reco_recur(apun);
}

