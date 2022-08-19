n = int(input())
for i in range(n):
    s = input()
    if s == 'P=NP':
        print('skipped')
    else:
        l = list(map(int, s.split('+')))
        print(l[0]+l[1])
