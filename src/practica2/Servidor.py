from Lista import Lista
from NodoL import NodoL
from Pila import Pila
from Cola import Cola
from flask import Flask, request, Response
app = Flask("Servidor")

lista = Lista()
pila = Pila()
cola = Cola()

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
	return str(valor) + " AGREGADO A LA PILA"

@app.route('/eliminarPila_ajax',methods=['POST']) 
def pilaEliminar():
	valor = str(request.form['valor'])
	valor = pila.eliminar()
	return str(valor) + " ELIMINADO DE PILA"

@app.route('/crearArchivoPila',methods=['POST']) 
def archivoCrearPila():
	nombre = str(request.form['nombre'])
	pila.crearArchivo()
	return "Archivo Creado"

@app.route('/grabarArchivoPila',methods=['POST']) 
def archivoGrabarPila():
	nombre = str(request.form['nombre'])
	return str(pila.grabarArchivo())

@app.route('/agregarCola_ajax',methods=['POST']) 
def colaAgregar(): 
	parametro1 = str(request.form['dato'])
	cola.agregar(parametro1)
	return str(parametro1) + " AGREGADO A LA COLA "

@app.route('/eliminarCola_ajax',methods=['POST']) 
def colaEliminar():
	parametro1 = str(request.form['dato'])
	dato = cola.eliminar()
	return str(dato) + " ELIMINADO DE COLA "

@app.route('/crearArchivoCola',methods=['POST']) 
def archivoCrear():
	nombre = str(request.form['nombre'])
	cola.crearArchivo()
	return "Archivo Creado"

@app.route('/grabarArchivoCola',methods=['POST']) 
def archivoGrabar():
	nombre = str(request.form['nombre'])
	return str(cola.grabarArchivo())


if __name__ == "__main__":
  	#app.run(debug=True, host='0.0.0.0')
  	app.run(debug=True)