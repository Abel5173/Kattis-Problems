from collections import Counter
import sys
lines = sys.stdin.readlines()

lines = [f.strip() for f in lines]

number = int(lines[0])
del(lines[0])

d = Counter(lines[:number])
k = Counter(lines[number:])

a = d-k
b = d-a

print(sum(b.values()))
