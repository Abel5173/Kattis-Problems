R, C, Zr, Zc = map(int, input().split())
l = []
for i in range(R):
    a = input()
    l.append(a)

for i in range(R):
    x = Zr
    while x > 0:
        for j in range(C):
            print(l[i][j]*Zc, end='')
        print()
        x -= 1
     