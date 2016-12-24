int const& foo()
{
  int ret{}; // lvalue
  return ret; // rvalue
}
