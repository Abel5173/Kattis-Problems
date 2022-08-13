n = int(input())
b = []
for x in range(n):
    f = int(input())
    b.append(f)
b.reverse()
print(*b, sep = "\n")