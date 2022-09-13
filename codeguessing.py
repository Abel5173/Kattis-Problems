p, q = map(int, input().split())
s = input()

if q - p <= 3:
    if s == 'AABB' and q - p == 1:
        print(q+1, q+2)
    elif s == 'ABAB' and q - p == 2:
        print(p+1, q+1)
    elif s == 'BBAA' and q - p == 1:
        print(p-2, p-1)
    elif s == 'BABA' and q - p == 2:
        print(p-1, q-1)
    elif s == 'ABBA' and q - p == 3:
        print(p+1, q-1)
    elif s == 'BAAB' and q - p == 1:
        print(p-1, q+1)
    else:
        print('-1')
else:
    print('-1')
