W = int(input())
n = int(input())
sum = 0
for i in range(n):
    a, b = map(int, input().split())
    sum += (a*b)
L = sum/W
print(int(L))
