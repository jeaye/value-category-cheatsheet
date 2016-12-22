int foo()
{
  int ret{}; // lvalue
  return ret; // xvalue
}
