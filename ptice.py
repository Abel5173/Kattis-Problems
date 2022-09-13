from itertools import cycle

n = int(input())
s = input()
b = {'Adrian': cycle("ABC"), 'Bruno': cycle("BABC"), 'Goran': cycle("CCAABB")}
x = {y: sum(c1 == c2 for c1, c2 in zip(s, z)) for y, z in b.items()}
m = max(x.values())
print(m)
for y, x1 in sorted(x.items()):
    if x1 == m:
        print(y)
