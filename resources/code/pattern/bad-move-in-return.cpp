std::vector<int> add_some(std::vector<int> &&v) // lvalue
{
  v.push_back(42);
  return v; // lvalue -- non-idiomatic
}

std::vector<int> v; // lvalue
v = add_some(std::move(v)); // sends in xvalue
