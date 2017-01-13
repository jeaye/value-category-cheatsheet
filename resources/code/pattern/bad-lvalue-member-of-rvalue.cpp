struct foo
{
  int a{};
  int const& get_a() // lvalue
  { return a; }
};

foo{}; // prvalue
foo{}.get_a(); // lvalue

int const &a{ foo{}.get_a() }; // undefined
