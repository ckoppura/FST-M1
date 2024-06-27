import pytest


def test_sumFixture(int_list):

    sum = 0

    for n in int_list:
        sum += n

    assert sum == 55
