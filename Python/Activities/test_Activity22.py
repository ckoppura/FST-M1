import pytest


def test_sum():
    a = 10
    b = 20
    c = a + b
    assert c == 20

	
@pytest.mark.activity
def test_substraction():
    a = 10
    b = 5
    c = a - b
    assert c == 5

	
@pytest.mark.activity
def test_division():
    a = 100
    b = 50
    c = a / b
    assert c == 2


def test_multiplication():
    a = 10
    b = 20
    c = a * b
    assert c == 200