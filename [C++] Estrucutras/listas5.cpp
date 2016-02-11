#include "stdafx.h"
#include "iostream"
using namespace System;
using namespace std;
struct nodo
{
	int codigo;
	char *nombre;
	int nivel;
	nodo *sig;
};

class lista5
{
	private:
		nodo* inicial;
	public:
		lista5();
		void crear_lista(nodo *anterior, nodo *nuevo);
		void leer_nodo(nodo *nuevo);
		void imprime_nodo(nodo *apum);
		void reco_recur(nodo *apun);
		nodo* getInicial();
		~lista5();
};

lista5::lista5()
{
	inicial=NULL;
}

void lista5::crear_lista(nodo *anterior, nodo *nuevo)
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

void lista5::leer_nodo(nodo *nuevo)
{
	cout<<"Entre el codigo del estudiante"<<endl;
	cin>>nuevo->codigo;
	cout<<"Entre el nombre del estudiante"<<endl;
	cin.ignore();
	nuevo->nombre = new char[30];
	cin.getline(nuevo->nombre, 30);
	cout<<"Entre el nivel del estudiante"<<endl;
	cin>>nuevo->nivel;
}

void lista5::imprime_nodo(nodo *apun)
{
	cout<<"El nombre es: "<<apun->nombre<<endl;
	cout<<"El codigo es: "<<apun->codigo<<endl;
	cout<<"El nivel es: "<<apun->nivel<<endl;

}

void lista5::reco_recur(nodo *apun)
{
	if(apun!=NULL){
		imprime_nodo(apun);
		reco_recur(apun->sig);
	}
	
}

nodo* lista5::getInicial()
{
	return inicial;
}

lista5::~lista5()
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
	lista5 l;
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

