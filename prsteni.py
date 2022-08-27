from math import gcd

n = int(input())
l = [int(i) for i in input().split()]
for i in range(1,n):
    a = gcd(l[0], l[i])
    b = l[0]//a
    c = l[i]//a
    print('{}/{}'.format(b,c))