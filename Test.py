# De 1

import numpy as np

x = np.array([
    [170, 73, 60],
    [180, 75, 65],
    [175, 70, 58],
    [172, 60, 50],
    [175, 63, 52],
    [169, 61, 49],
    [160, 53, 40],
    [155, 51, 41],
    [162, 52, 43]

])
y1 = np.array([-1, -1, -1, -1, -1, -1, 1, 1, 1])
y2 = np.array([-1, -1, -1, 1, 1, 1])
w1 = np.array([1, 1, 1, 1])
w2 = np.array([1, 1, 1, 1])


def predict(x, w):
    x.shape = (1, len(x))
    x = np.concatenate((x, np.ones((len(x), 1))), axis=1)
    return np.sign(x @ w.T)


def train(x, y, w):
    x = np.concatenate((x, np.ones((len(x), 1))), axis=1)
    ypre = np.sign(x @ w.T)
    E = y - ypre
    w = w + E @ x
    return w


def toWordA_C(o1):
    if o1 == -1:
        return 'A'
    else:
        return 'C'

def toWordA_B(o1):
    if o1 == -1:
        return 'A'
    else:
        return 'B'


def pre(x):
    x = np.array(x)
    outN1 = predict(x, w1)
    if outN1 == -1:
        outN2 = predict(x,w2)
        print(toWordA_B(outN2))
    else:
        print(toWordA_C(outN1))

a = []
for i in x:
    if predict(x,w1) == -1:
        a.append(i)
a = np.array(a)
for i in range(1000):
    w2 = train(a, y2, w2)
for i in range(1000):
    w1 = train(x, y1, w1)
cao = int(input('Nhập chiều cao: '))
cannang = int(input('Nhập cân nặng: '))
luongthucan = int(input('Nhập lượng thức ăn: '))
pre([cao, cannang, luongthucan])


