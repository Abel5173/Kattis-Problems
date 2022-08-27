n = int(input())
b = True
for i in range(n):
    a = int(input())
    if b:
        x = a
        b = False
        continue
    if a % x == 0:
        print(a)
        b = True