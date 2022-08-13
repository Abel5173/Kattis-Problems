n = input()
m = input()
c = 0
for i in range(4):
    if n[i] == m[i]:
        continue
    else:
        c += 1
print(pow(2, c))
