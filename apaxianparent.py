y, p = input().split()
l = ['a', 'i', 'o', 'u']
if y[-1] == 'e':
    a = y+'x'+p
    print(a)
elif y[-1] in l:
    a = y[:-1]+'ex'+p
    print(a)
elif y[-2:] == 'ex':
    a = y+p
    print(a)
else:
    a = y+'ex'+p
    print(a)
