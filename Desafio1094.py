casos_teste = int(input())

cobaias_experimento = []
total_cobaias = 0
total_coelhos = 0
total_ratos = 0
total_sapos = 0
percent_coelhos = 0
percent_ratos = 0
percent_sapos = 0

for i in range(0, casos_teste):
    cobaias_experimento.append(input().split())

for i in range(len(cobaias_experimento)):
    total_cobaias  = total_cobaias + int(cobaias_experimento[i][0])
    if cobaias_experimento[i][1] == 'C':
        total_coelhos = total_coelhos + int(cobaias_experimento[i][0])
    elif cobaias_experimento[i][1] == 'R':
        total_ratos = total_ratos + int(cobaias_experimento[i][0])
    elif cobaias_experimento[i][1] == 'S':
        total_sapos = total_sapos + int(cobaias_experimento[i][0])

percent_coelhos = (total_coelhos * 100) / total_cobaias
percent_ratos = (total_ratos * 100) / total_cobaias
percent_sapos = (total_sapos * 100) / total_cobaias

print('Total: {0} cobaias'.format(total_cobaias))
print('Total de coelhos: {0}'.format(total_coelhos))
print('Total de ratos: {0}'.format(total_ratos))
print('Total de sapos: {0}'.format(total_sapos))
print('Percentual de coelhos: {0:.2f} %'.format(percent_coelhos))
print('Percentual de ratos: {0:.2f} %'.format(percent_ratos))
print('Percentual de sapos: {0:.2f} %'.format(percent_sapos))