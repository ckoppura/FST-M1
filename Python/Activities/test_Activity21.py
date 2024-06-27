import pytest


def test_sum():
    a = 10
    b = 20
    c = a + b
    assert c == 20


def test_substraction():
    a = 10
    b = 5
    c = a - b
    assert c == 5


def division():
    a = 100
    b = 50
    c = a / b
    assert c == 2


def multiplication():
    a = 10
    b = 20
    c = a * b
    assert c == 200

def test_greater():
    x = 2
    y = 5
    assert y > x