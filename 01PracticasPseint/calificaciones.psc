Algoritmo calificaciones
	Escribir "Desarrolle un algoritmo que permita escribir calificaciones numericas a letras" 
	nota<-0
	Repetir
		Escribir "Ingresa calf numerica"
		Leer nota
		Si num > 20 Entonces
			Escribir "No se aceptan numeros mayores a 20"
		SiNo
			Si nota>=19 y nota<=20 Entonces
				Escribir "Tu nota es A"
			SiNo
				Si nota>=16 y nota<=18 Entonces
					Escribir "Tu nota es B"
				SiNo
					Si nota>=13 y nota<=15 Entonces
						Escribir "Tu nota es C"
					SiNo
						Si nota>=10 y nota<=12 Entonces
							Escribir "Tu nota es D"
						SiNo
							Si nota>=0 y nota<=9 Entonces
								Escribir "Tu nota es E"
							SiNo
								Escribir "no negativos"
							Fin Si
						Fin Si
					Fin Si
				FinSi
			FinSi
		Fin Si
		
	Hasta Que nota = 0
	
FinAlgoritmo
