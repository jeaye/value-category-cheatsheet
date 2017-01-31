std::vector<int> add_some(std::vector<int> &&v) // lvalue
{
  v.push_back(42);
  return std::move(v); // xvalue
}

std::vector<int> v; // lvalue
v = add_some(std::move(v)); // sends in xvalue
