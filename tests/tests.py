from unittest import TestCase

from main import test_me


class TestTestMe(TestCase):
    def test_test_me_is_function(self):
        is_callable = callable(test_me)
        self.assertEqual(is_callable, True)

    def test_is_not_callable(self):
        is_callable = callable(1)
        self.assertEqual(is_callable, False)
