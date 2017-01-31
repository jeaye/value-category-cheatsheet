{
  std::vector<int> a{ calculate_things() };

  // done with a, so move it
  use_results(std::move(a)); // move gives an xvalue

  // a is now moved-from
}

// can be a non-reference parameter
void use_results(std::vector<int> v);

// can explicitly require an rvalue, to
// prevent accidental copies
void use_results(std::vector<int> &&v);
