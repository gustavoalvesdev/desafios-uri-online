peca1 = input()
peca2 = input()
peca1_partes = peca1.split()
peca2_partes = peca2.split()
cod_peca1 = int(peca1_partes[0])
numero_peca1 = int(peca1_partes[1])
val_unit_peca1 = float(peca1_partes[2])
cod_peca2 = int(peca2_partes[0])
numero_peca2 = int(peca2_partes[1])
val_unit_peca2 = float(peca2_partes[2])
val_total = numero_peca1 * val_unit_peca1 + numero_peca2 * val_unit_peca2
print('VALOR A PAGAR: R$ %.2f' % val_total)
