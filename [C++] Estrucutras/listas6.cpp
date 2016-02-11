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

class lista6
{
	private:
		nodo* inicial;
	public:
		lista6();
		void crear_lista(nodo *anterior, nodo *nuevo);
		void leer_nodo(nodo *nuevo);
		void imprime_nodo(nodo *apum);
		void reco_recur(nodo *apun);
		nodo * buscar_nodo(nodo *apun, int &codigo);
		nodo * agregar_nodo(nodo * anterior, nodo *nuevo,int &codigo);
		nodo* getInicial();
		void setInicial(nodo *in);
		~lista6();
};

lista6::lista6()
{
	inicial=NULL;
}

void lista6::crear_lista(nodo *anterior, nodo *nuevo)
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

void lista6::leer_nodo(nodo *nuevo)
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

void lista6::imprime_nodo(nodo *apun)
{
	cout<<"El nombre es: "<<apun->nombre<<endl;
	cout<<"El codigo es: "<<apun->codigo<<endl;
	cout<<"El nivel es: "<<apun->nivel<<endl;

}

void lista6::reco_recur(nodo *apun)
{
	if(apun!=NULL){
		imprime_nodo(apun);
		reco_recur(apun->sig);
	}
	
}

nodo* lista6::getInicial()
{
	return inicial;
}

void lista6::setInicial(nodo *in)
{
	inicial = in;

}

nodo* lista6::buscar_nodo(nodo *apun, int &codigo)
{
	while(apun!=NULL)
	{
		if(apun->codigo==codigo) return apun;
		else apun=apun->sig;
	}
	return NULL;
}

nodo* lista6::agregar_nodo(nodo * anterior, nodo *nuevo,int &codigo)
{
	if(codigo==0)
	{
		//agrega al inicio de la lista
		nuevo->sig = anterior;
		anterior=nuevo;
		leer_nodo(nuevo);
		return anterior;
	}
	else
	{
		//agrega despues del primero, segundo,.., o ultimo elemento de la lista
		nuevo->sig=anterior->sig;
		anterior->sig=nuevo;
		leer_nodo(nuevo);
		return anterior;
	}
}


lista6::~lista6()
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
	lista6 l;
	anterior=NULL;
	cout<<"EMpieza A CREAR LA LISTA ORGINIAL"<<endl<<endl;
	do{
		nuevo =new nodo;
		l.crear_lista(anterior, nuevo);
		anterior=nuevo;
		cout<<endl;
		cout<<"Desea crear otro nodo? (s/n)"<<endl<<endl;
		cin>>resp;
		resp=tolower(resp);
	}while(resp!='n');
	//inicio del recorrido de la lista
	cout<<"LA LISTA ORGINIAL CREADA ES: "<<endl;
	apun=l.getInicial();
	l.reco_recur(apun);

	//inicio de la agregacion de nuevos nodos
	cout<<endl;
	cout<<"INICIO DE LA AGREGACION DE NUEVOS NODOS A LA LISTA ORIGINAL"<<endl;
	int codigo;
	apun= l.getInicial();
	do
	{
    cout<<endl;
	cout<<"Entre codigo clave (digite cero si va a agregar a la cabez de la lista, en"<<endl;
	cout<<"caso contrario digite el codigo del nodo anterior al que va a crear)"<<endl<<endl;

	cin>>codigo;
	if(codigo==0)
	{
		nuevo = new nodo;
		l.setInicial(l.agregar_nodo(l.getInicial(),nuevo,codigo));
	}
	else
	{
		anterior = l.getInicial();
		anterior = l.buscar_nodo(anterior,codigo);
		if(anterior!=NULL)
		{
			nuevo = new nodo;
			anterior = l.agregar_nodo(anterior,nuevo,codigo);
		}
		else cout<<"el nodo no a sido encontrado"<<endl;
	}
	cout<<"Desea Agregar otro nodo (s/n)"<<endl;
	cin>>resp;
	resp=tolower(resp);

	}while(resp!='n');
	cout<<"La lista completa es"<<endl;
	apun = l.getInicial();
	l.reco_recur(apun);
}

