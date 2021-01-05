// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The provider type for the auth0 package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}
	if args.ClientId == nil {
		args.ClientId = pulumi.StringPtr(getEnvOrDefault("", nil, "AUTH0_CLIENT_ID").(string))
	}
	if args.ClientSecret == nil {
		args.ClientSecret = pulumi.StringPtr(getEnvOrDefault("", nil, "AUTH0_CLIENT_SECRET").(string))
	}
	if args.Debug == nil {
		args.Debug = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "AUTH0_DEBUG").(bool))
	}
	if args.Domain == nil {
		args.Domain = pulumi.StringPtr(getEnvOrDefault("", nil, "AUTH0_DOMAIN").(string))
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:auth0", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	ClientId     *string `pulumi:"clientId"`
	ClientSecret *string `pulumi:"clientSecret"`
	Debug        *bool   `pulumi:"debug"`
	Domain       *string `pulumi:"domain"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	ClientId     pulumi.StringPtrInput
	ClientSecret pulumi.StringPtrInput
	Debug        pulumi.BoolPtrInput
	Domain       pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (Provider) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil)).Elem()
}

func (i Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct {
	*pulumi.OutputState
}

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProviderOutput)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ProviderOutput{})
}
