from math import pi
import string


def timeTaken(aphorism):
    circle = list(string.ascii_uppercase + " \'")
    time = 1
    for i in range(len(aphorism) - 1):
        ch1 = circle.index(aphorism[i])
        ch2 = circle.index(aphorism[i + 1])
        dist = min(abs(ch1 - ch2), 28 - abs(ch1 - ch2)) * (60 * pi/28)
        time += dist/15 + 1
    return time


ans = []
for _ in range(int(input())):
    ans.append(timeTaken(input()))

for a in ans:
    print(a)
