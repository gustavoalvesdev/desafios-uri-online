p1 = input()
p2 = input()

separaP1 = p1.split()
separaP2 = p2.split()

x1 = float(separaP1[0])
y1 = float(separaP1[1])

x2 = float(separaP2[0])
y2 = float(separaP2[1])

distancia = (((x2 - x1) ** 2) + ((y2 - y1) ** 2)) ** 0.5

print('%.4f' % distancia)
