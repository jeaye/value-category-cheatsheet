struct foo
{
  int a{};
  int const& get_a() // lvalue
  { return a; }
};

int const a{ foo{}.get_a() }; // copy
