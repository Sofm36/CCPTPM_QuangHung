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
y1 = np.array([-1, -1, -1, 0, 0, 0, 1, 1, 1])
y2 = np.array([-1, -1, -1, 1, 1, 1])
w1 = np.array([1, 1, 1, 1])
w2 = np.array([1, 1, 1, 1])


def predict(x, w):
    x.shape = (1, len(x))
    x = np.concatenate((x, np.ones((len(x), 1))), axis=1)
    return x @ w.T


def train(x, y, w):
    x = np.concatenate((x, np.ones((len(x), 1))), axis=1)
    ypre = np.sign(x @ w.T)
    E = y - ypre
    w = w + E @ x
    return w


def toWord(o1):
    if o1 < -100000:
        return 'A'
    elif o1 < 0:
        return 'B'
    else:
        return 'C'


def pre(x):
    x = np.array(x)
    outN1 = predict(x, w1)
    print(toWord(outN1))


for i in range(1000):
    w1 = train(x, y1, w1)
cao = int(input('Nhập chiều cao: '))
cannang = int(input('Nhập cân nặng: '))
luongthucan = int(input('Nhập lượng thức ăn: '))
pre([cao, cannang, luongthucan])
