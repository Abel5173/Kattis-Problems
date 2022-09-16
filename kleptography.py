n, m = map(int, input().split())
k = input()
c = input()
l = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
     'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
for i in range(1, m-n+1):
    x = (l.index(c[-i])-l.index(k[-i])) % 26
    k = l[x] + k
print(k)
