from NodoPila import NodoPila

class Pila():
    def __init__ (self):
        self.ultimo = None
        self.cont = 0
        
    def agregar(self, dato):
        if self.ultimo != None:
            nuevoNodo = NodoPila(dato, self.cont, None)
            nuevoNodo.siguiente = self.ultimo
            self.ultimo = nuevoNodo
            self.cont=self.cont+1
                
        if self.ultimo == None:
            nuevoNodo = NodoPila(dato, self.cont, None)
            self.cont=self.cont+1
            self.ultimo = nuevoNodo
            
    def mostrar(self):
        temp = self.ultimo
        print("\nLos nombre en la Pila son :")
        while temp != None:
            print("pos: "+str(temp.posicion)+" nombre: "+temp.dato)
            temp = temp.siguiente 
            
    def eliminar(self):
        temp = self.ultimo
        self.ultimo = self.ultimo.siguiente
        return str(temp.dato)
        
    def size(self):
        return self.cont
    
    def crearArchivo(self):
        archivo=open('imagenPila.txt','w')
        archivo.close()
        
    def grabarArchivo(self):
        temp = self.ultimo
        cont1 = 0
        archivo=open('imagenPila.txt','a')
        archivo.write('digraph G{\n')
        while temp!=None:
            archivo.write("nodo_" + str(temp.dato) + " [label="+str(temp.dato)+"]\n")
            cont1=cont1+1
            temp = temp.siguiente
        cont1 = 0
        cont2 = cont1+1
        temp = self.ultimo
        while temp!=None:
            if temp.siguiente!=None:
                archivo.write("nodo_"+str(temp.dato)+"->"+"nodo_"+str(temp.siguiente.dato)+"\n")
                cont1=cont1+1
                cont2=cont2+1
            temp = temp.siguiente
        archivo.write('}')
        archivo.close()
        return "imagenPila"