from Lista import Lista
from NodoL import NodoL
from Pila import Pila
from flask import Flask, request, Response
app = Flask("Servidor")

lista = Lista()
pila = Pila()

@app.route('/buscar_ajax',methods=['POST']) 
def buscar_ajax():
	nombre = str(request.form['nombre'])
	datobuscado = lista.consultar(nombre)	
	return str(datobuscado)

@app.route('/agregarLista_ajax',methods=['POST']) 
def agregarLista_ajax():
	nombre = str(request.form['nombre'])
	lista.insertar(nombre)
	return "DATO INGRESADO -> " + str(nombre) + " -> " + str(lista.indiceLista - 1)	

@app.route('/borrar_ajax',methods=['POST']) 
def borrar_ajax():
	dato = str(request.form['index'])
	datoborrado = lista.eliminar(dato)	
	return str(datoborrado)

@app.route('/crearArchivoLista',methods=['POST']) 
def archivoCrearLista():
	dato = str(request.form['nombre'])
	lista.crearArchivo()
	return "Archivo Creado"

@app.route('/grabarArchivoLista',methods=['POST']) 
def archivoGrabarLista():
	dato = str(request.form['nombre'])
	return str(lista.grabarArchivo())

@app.route('/agregarPila_ajax',methods=['POST']) 
def pilaAgregar(): 
	valor = str(request.form['valor'])
	pila.agregar(valor)
	return "El nombre '" + str(valor) + "' fue agregado con exito a la PILA "

@app.route('/eliminarPila_ajax',methods=['POST']) 
def pilaEliminar():
	valor = str(request.form['valor'])
	valor = pila.eliminar()
	return "El nombre '" + str(valor) + "' fue eliminado con exito de la PILA "

@app.route('/crearArchivoPila',methods=['POST']) 
def archivoCrearPila():
	nombre = str(request.form['nombre'])
	pila.crearArchivo()
	return "arichivo creado"

@app.route('/grabarArchivoPila',methods=['POST']) 
def archivoGrabarPila():
	nombre = str(request.form['nombre'])
	return str(pila.grabarArchivo())

if __name__ == "__main__":
  	#app.run(debug=True, host='0.0.0.0')
  	app.run(debug=True)