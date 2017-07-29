import random
import math
import numpy as np

# Variables de dimensiones:
lado_baldosa = 25
lado_x_borrador = 8
lado_y_borrador = 4
mitad_x = lado_x_borrador/2
mitad_y = lado_y_borrador/2

# Variables de simulacion
prob = 0
intentos = 1000

# Rutina simulacion
for i in range(intentos):

    #centro y angulo del borrador aleatorio
    x = random.random()*lado_baldosa
    y = random.random()*lado_baldosa
    angulo = random.random()*np.pi

    #Trigonometria
    hipotenusa = np.sqrt((mitad_x)**2 + (mitad_y)**2)
    centro = np.array([x, y])
    angulo_entre_diagonales = 2*math.asin(lado_y_borrador/(2*hipotenusa))
    mitad_ang_diag = angulo_entre_diagonales/2

    # Calcula esquinas
    esquina_uno = centro + np.array([ hipotenusa*math.cos(angulo-mitad_ang_diag), hipotenusa*math.sin(angulo-mitad_ang_diag)])
    esquina_dos = centro - np.array([ hipotenusa*math.sin((np.pi/2)-(angulo+mitad_ang_diag)), hipotenusa*math.cos((np.pi/2)-(angulo+mitad_ang_diag))])
    esquina_tres = centro - np.array([ hipotenusa*math.cos(angulo-mitad_ang_diag), hipotenusa*math.sin(angulo-mitad_ang_diag)])
    esquina_cuatro = centro + np.array([ hipotenusa*math.sin((np.pi/2)-(angulo+mitad_ang_diag)), hipotenusa*math.cos((np.pi/2)-(angulo+mitad_ang_diag))])

    # Lista de esquinas
    esquinas = np.array([esquina_uno, esquina_dos, esquina_tres, esquina_cuatro])

    cont = 0
    for esquina in esquinas:
        if cont == 0:
            if sum(esquina > lado_baldosa) or sum(esquina < 0):
                prob = prob + 1
                cont = 1

print(prob/intentos)
