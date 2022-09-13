from math import sqrt

n = int(input())
l = set()
for i in range(1, int(sqrt(n))+1):
    if n % i == 0:
        l.add(i)
        l.add(n//i)
l = sorted(l)
for i in l:
    print(i)
