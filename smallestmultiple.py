from math import gcd
try:
    while True:
        l = [int(i) for i in input().split()]   
        a = 1
        for i in l:
            a = a*i//gcd(a, i)
        print(a)
except:
    pass