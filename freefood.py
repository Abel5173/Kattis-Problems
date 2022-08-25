n = int(input())
s = set()
for i in range(n):
    a, b = map(int, input().split())
    for j in range(a, b+1):
        s.add(j)
print(len(s))