n, m = map(int, input().split())
p = input()  # [::-1]
c = list(input())  # [::-1])
x = []
for i in range(n):
    x.append(chr((ord(c[i]) - ord(p[i])) % 26 + 97))
    c[i] = p[i]
for i in range(n, m):
    x.append(chr((ord(c[i]) - ord(x[i - n])) % 26 + 97))
    c[i] = x[i - n]
print(''.join((c)))  # [::-1]))
