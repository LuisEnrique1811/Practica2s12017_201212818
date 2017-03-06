from NodoCola import NodoCola

class Cola():
    def __init__ (self):
        self.inicio = None
        self.cont = 0
        
    def agregar(self, dato):
        if self.inicio != None:
            temp = self.inicio
            while temp.siguiente != None:
                temp = temp.siguiente
            
            nuevoNodo = NodoCola(dato, self.cont, None)
            self.cont=self.cont+1
            temp.siguiente = nuevoNodo
                
        if self.inicio == None:
            nuevoNodo = NodoCola(dato, self.cont, None)
            self.cont=self.cont+1
            self.inicio = nuevoNodo
            
    def mostrar(self):
        temp = self.inicio        
        while temp != None:
            temp = temp.siguiente   
            
    def eliminar(self):
        temp = self.inicio
        self.inicio = self.inicio.siguiente
        return str(temp.dato)
    
    def crearArchivo(self):
        archivo=open('imagenCola.txt','w')
        archivo.close()
        
    def grabarArchivo(self):
        temp = self.inicio
        cont1 = 0
        archivo=open('imagenCola.txt','a')
        archivo.write('digraph G{\n')
        while temp!=None:
            archivo.write("nodo_" + str(temp.dato) + " [label="+str(temp.dato)+"]\n")
            cont1=cont1+1
            temp = temp.siguiente
        cont1 = 0
        cont2 = cont1+1
        temp = self.inicio
        while temp!=None:
            if temp.siguiente!=None:
                archivo.write("nodo_"+str(temp.dato)+"->"+"nodo_"+str(temp.siguiente.dato)+"\n")
                cont1=cont1+1
                cont2=cont2+1
            temp = temp.siguiente
        archivo.write('}')
        archivo.close()
        return "imagenCola"