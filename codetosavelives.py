n = int(input())
for i in range(n):
    x = int(''.join([i for i in input().split()]))
    y = int(''.join([i for i in input().split()]))
    z = ' '.join(list(str(x+y)))
    print(z)
