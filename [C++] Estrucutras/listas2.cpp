#include "stdafx.h"
#include "iostream"
using namespace System;
using namespace std;
struct nodo
{
	int dato;
	nodo *sig;
};

class lista2
{
	private:
		nodo* inicial;
	public:
		lista2();
		void crear_lista(nodo *anterior, nodo *nuevo);
		~lista2();
};

lista2::lista2()
{
	inicial=NULL;
}

void lista2::crear_lista(nodo *anterior, nodo *nuevo)
{
	if(anterior==NULL)
	{
		cout<<"creo"<<endl;
		nuevo->sig=inicial;
		inicial=nuevo;
	}
	else
	{
		cout<<"creo"<<endl;
		nuevo->sig=anterior->sig;
		anterior->sig=nuevo;
	}
}

lista2::~lista2()
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
    nodo *anterior, *nuevo;
	char resp;
	lista2 l;
	anterior=NULL;
	do{
	
		nuevo =new nodo;
		
		l.crear_lista(anterior, nuevo);
		anterior=nuevo;
		cout<<"Desea crear otro nodo? (s/n)"<<endl;
		cin>>resp;
		resp=tolower(resp);
	}while(resp!='n');
	}

