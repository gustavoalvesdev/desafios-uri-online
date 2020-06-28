valores = input()

separaValores = valores.split()

a = int(separaValores[0])
b = int(separaValores[1])
c = int(separaValores[2])

maiorAB = (a + b + abs(a - b)) / 2
maiorABC = (maiorAB + c + abs(maiorAB - c)) / 2

print('%i eh o maior' % maiorABC)
