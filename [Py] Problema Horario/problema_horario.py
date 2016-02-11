import itertools

class Asignatura(object):
   
    def __init__(self, codigo, nombre):
        self.codigo = codigo
        self.nombre = nombre
        self.color = 0
    
    def __str__(self):
        return str("Codigo: {0}; Nombre: {1}".format(self.codigo, self.nombre))

class Alumno(object):
    
    def __init__(self, nombre):
        self.nombre = nombre
        self.asignaturas = []
        
    def agregar_asignatura(self, asignatura):
        self.asignaturas.append(asignatura)
    
    def __str__(self):
        return str("Nombre: {0}, Asignaturas: {1}".format(self.nombre, self.asignaturas) )
      
class Grafo:
    
    def __init__(self):
        self.relaciones = {}
        self.nodos = []
        
    def __str__(self):
        return str(self.relaciones)
 
    def agregar(self, elemento):
        self.relaciones.update({elemento:[]})
        self.nodos.append(elemento)
    
    def relacionar(self, origen, destino):
        self.relaciones[origen].append(destino)
        
class Runner(object): 
        
        
    def main(self):
        
        menu = True
        alumnos = []
        materias = []
        
        while(menu):
            
            print("Menu Principal")
            print("--------------------")
            print("1. Crear Alumno")
            print("2. Crear Materia")
            print("3. Asignar Materia")
            print("4. Colorear Grafo")
            print("--------------------")
            print("Por favor ingrese una opcion")
            
            opcion = input()
            
            if(opcion == "1"):
                print("Nombre: ")
                nombre_alu = input()
                alumno = Alumno(nombre_alu)
                alumnos.append(alumno)
                
            if(opcion == "2"):
                print("Codigo: ")
                codigo = input()
                print("Nombre: ")
                nombre_asig = input()
                asignatura = Asignatura(codigo, nombre_asig)
                materias.append(asignatura)
                
                
            if(opcion == "3"):
                print("Nombre del Alumno: ")
                nom_alum = input()
                print("Codigo Materia: ")
                cod_mat = input()
                
                for j,i in enumerate(alumnos):
                    if i.nombre == nom_alum:
                        temp = j
                        
                for j,i in enumerate(materias):
                    if i.codigo == cod_mat:
                        temp_mat = j
                
                alumnos[temp].agregar_asignatura(materias[temp_mat])                 
                
            if(opcion == "4"):
                
                g = Grafo()
                menu = False
                relaciones_materias = [list(itertools.combinations([i for i in j.asignaturas],2)) for j in alumnos]
                aux_relaciones = []
                
                for i in relaciones_materias:
                    for j in i:
                        aux_relaciones.append(j)
                
                for i in materias:
                    g.agregar(i)
                
                for i in aux_relaciones:
                    g.relacionar(i[0],i[1])
                    g.relacionar(i[1],i[0])
                
                for i in g.nodos:
                    d = [h.color for h in g.relaciones[i]]
                    s = True
                    while(s):
                        if i.color in d or i.color == 0:
                            i.color+=1                        
                        else:
                            s = False
                                
                color_maximo = max([i.color for i in g.nodos])
                
                aux_hor = [[] for i in range(color_maximo+1)]
                for i in g.nodos:                    
                    aux_hor[i.color].append(i) 
                
                for i in aux_hor:
                    print("Las Materias: ")
                    for j in i:
                        print(j.nombre)
                    print("se pueden ver juntas")
                    print("--------------------")             
                    
            


if __name__ == "__main__":
    run = Runner()
    run.main()