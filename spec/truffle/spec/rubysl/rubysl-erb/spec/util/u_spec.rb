require 'erb'
require File.expand_path('../shared/url_encode', __FILE__)

describe "ERB::Util.u" do
  it_behaves_like :erb_util_url_encode, :u
end

