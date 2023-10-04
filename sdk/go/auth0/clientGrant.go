// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Auth0 uses various grant types, or methods by which you grant limited access to your resources to another entity without exposing credentials. The OAuth 2.0 protocol supports several types of grants, which allow different types of access. This resource allows you to create and manage client grants used with configured Auth0 clients.
//
// ## Import
//
// This resource can be imported by specifying the client grant ID. You can find this within the Management Dashboard in Application -> APIs -> Expand the required API. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/clientGrant:ClientGrant my_client_grant "cgr_XXXXXXXXXXXXXXXX"
//
// ```
type ClientGrant struct {
	pulumi.CustomResourceState

	// Audience or API Identifier for this grant.
	Audience pulumi.StringOutput `pulumi:"audience"`
	// ID of the client for this grant.
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// Permissions (scopes) included in this grant.
	Scopes pulumi.StringArrayOutput `pulumi:"scopes"`
}

// NewClientGrant registers a new resource with the given unique name, arguments, and options.
func NewClientGrant(ctx *pulumi.Context,
	name string, args *ClientGrantArgs, opts ...pulumi.ResourceOption) (*ClientGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Audience == nil {
		return nil, errors.New("invalid value for required argument 'Audience'")
	}
	if args.ClientId == nil {
		return nil, errors.New("invalid value for required argument 'ClientId'")
	}
	if args.Scopes == nil {
		return nil, errors.New("invalid value for required argument 'Scopes'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClientGrant
	err := ctx.RegisterResource("auth0:index/clientGrant:ClientGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClientGrant gets an existing ClientGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClientGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClientGrantState, opts ...pulumi.ResourceOption) (*ClientGrant, error) {
	var resource ClientGrant
	err := ctx.ReadResource("auth0:index/clientGrant:ClientGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClientGrant resources.
type clientGrantState struct {
	// Audience or API Identifier for this grant.
	Audience *string `pulumi:"audience"`
	// ID of the client for this grant.
	ClientId *string `pulumi:"clientId"`
	// Permissions (scopes) included in this grant.
	Scopes []string `pulumi:"scopes"`
}

type ClientGrantState struct {
	// Audience or API Identifier for this grant.
	Audience pulumi.StringPtrInput
	// ID of the client for this grant.
	ClientId pulumi.StringPtrInput
	// Permissions (scopes) included in this grant.
	Scopes pulumi.StringArrayInput
}

func (ClientGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*clientGrantState)(nil)).Elem()
}

type clientGrantArgs struct {
	// Audience or API Identifier for this grant.
	Audience string `pulumi:"audience"`
	// ID of the client for this grant.
	ClientId string `pulumi:"clientId"`
	// Permissions (scopes) included in this grant.
	Scopes []string `pulumi:"scopes"`
}

// The set of arguments for constructing a ClientGrant resource.
type ClientGrantArgs struct {
	// Audience or API Identifier for this grant.
	Audience pulumi.StringInput
	// ID of the client for this grant.
	ClientId pulumi.StringInput
	// Permissions (scopes) included in this grant.
	Scopes pulumi.StringArrayInput
}

func (ClientGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clientGrantArgs)(nil)).Elem()
}

type ClientGrantInput interface {
	pulumi.Input

	ToClientGrantOutput() ClientGrantOutput
	ToClientGrantOutputWithContext(ctx context.Context) ClientGrantOutput
}

func (*ClientGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientGrant)(nil)).Elem()
}

func (i *ClientGrant) ToClientGrantOutput() ClientGrantOutput {
	return i.ToClientGrantOutputWithContext(context.Background())
}

func (i *ClientGrant) ToClientGrantOutputWithContext(ctx context.Context) ClientGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientGrantOutput)
}

func (i *ClientGrant) ToOutput(ctx context.Context) pulumix.Output[*ClientGrant] {
	return pulumix.Output[*ClientGrant]{
		OutputState: i.ToClientGrantOutputWithContext(ctx).OutputState,
	}
}

// ClientGrantArrayInput is an input type that accepts ClientGrantArray and ClientGrantArrayOutput values.
// You can construct a concrete instance of `ClientGrantArrayInput` via:
//
//	ClientGrantArray{ ClientGrantArgs{...} }
type ClientGrantArrayInput interface {
	pulumi.Input

	ToClientGrantArrayOutput() ClientGrantArrayOutput
	ToClientGrantArrayOutputWithContext(context.Context) ClientGrantArrayOutput
}

type ClientGrantArray []ClientGrantInput

func (ClientGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientGrant)(nil)).Elem()
}

func (i ClientGrantArray) ToClientGrantArrayOutput() ClientGrantArrayOutput {
	return i.ToClientGrantArrayOutputWithContext(context.Background())
}

func (i ClientGrantArray) ToClientGrantArrayOutputWithContext(ctx context.Context) ClientGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientGrantArrayOutput)
}

func (i ClientGrantArray) ToOutput(ctx context.Context) pulumix.Output[[]*ClientGrant] {
	return pulumix.Output[[]*ClientGrant]{
		OutputState: i.ToClientGrantArrayOutputWithContext(ctx).OutputState,
	}
}

// ClientGrantMapInput is an input type that accepts ClientGrantMap and ClientGrantMapOutput values.
// You can construct a concrete instance of `ClientGrantMapInput` via:
//
//	ClientGrantMap{ "key": ClientGrantArgs{...} }
type ClientGrantMapInput interface {
	pulumi.Input

	ToClientGrantMapOutput() ClientGrantMapOutput
	ToClientGrantMapOutputWithContext(context.Context) ClientGrantMapOutput
}

type ClientGrantMap map[string]ClientGrantInput

func (ClientGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientGrant)(nil)).Elem()
}

func (i ClientGrantMap) ToClientGrantMapOutput() ClientGrantMapOutput {
	return i.ToClientGrantMapOutputWithContext(context.Background())
}

func (i ClientGrantMap) ToClientGrantMapOutputWithContext(ctx context.Context) ClientGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientGrantMapOutput)
}

func (i ClientGrantMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ClientGrant] {
	return pulumix.Output[map[string]*ClientGrant]{
		OutputState: i.ToClientGrantMapOutputWithContext(ctx).OutputState,
	}
}

type ClientGrantOutput struct{ *pulumi.OutputState }

func (ClientGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientGrant)(nil)).Elem()
}

func (o ClientGrantOutput) ToClientGrantOutput() ClientGrantOutput {
	return o
}

func (o ClientGrantOutput) ToClientGrantOutputWithContext(ctx context.Context) ClientGrantOutput {
	return o
}

func (o ClientGrantOutput) ToOutput(ctx context.Context) pulumix.Output[*ClientGrant] {
	return pulumix.Output[*ClientGrant]{
		OutputState: o.OutputState,
	}
}

// Audience or API Identifier for this grant.
func (o ClientGrantOutput) Audience() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientGrant) pulumi.StringOutput { return v.Audience }).(pulumi.StringOutput)
}

// ID of the client for this grant.
func (o ClientGrantOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientGrant) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// Permissions (scopes) included in this grant.
func (o ClientGrantOutput) Scopes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ClientGrant) pulumi.StringArrayOutput { return v.Scopes }).(pulumi.StringArrayOutput)
}

type ClientGrantArrayOutput struct{ *pulumi.OutputState }

func (ClientGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientGrant)(nil)).Elem()
}

func (o ClientGrantArrayOutput) ToClientGrantArrayOutput() ClientGrantArrayOutput {
	return o
}

func (o ClientGrantArrayOutput) ToClientGrantArrayOutputWithContext(ctx context.Context) ClientGrantArrayOutput {
	return o
}

func (o ClientGrantArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ClientGrant] {
	return pulumix.Output[[]*ClientGrant]{
		OutputState: o.OutputState,
	}
}

func (o ClientGrantArrayOutput) Index(i pulumi.IntInput) ClientGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClientGrant {
		return vs[0].([]*ClientGrant)[vs[1].(int)]
	}).(ClientGrantOutput)
}

type ClientGrantMapOutput struct{ *pulumi.OutputState }

func (ClientGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientGrant)(nil)).Elem()
}

func (o ClientGrantMapOutput) ToClientGrantMapOutput() ClientGrantMapOutput {
	return o
}

func (o ClientGrantMapOutput) ToClientGrantMapOutputWithContext(ctx context.Context) ClientGrantMapOutput {
	return o
}

func (o ClientGrantMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ClientGrant] {
	return pulumix.Output[map[string]*ClientGrant]{
		OutputState: o.OutputState,
	}
}

func (o ClientGrantMapOutput) MapIndex(k pulumi.StringInput) ClientGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClientGrant {
		return vs[0].(map[string]*ClientGrant)[vs[1].(string)]
	}).(ClientGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClientGrantInput)(nil)).Elem(), &ClientGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientGrantArrayInput)(nil)).Elem(), ClientGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientGrantMapInput)(nil)).Elem(), ClientGrantMap{})
	pulumi.RegisterOutputType(ClientGrantOutput{})
	pulumi.RegisterOutputType(ClientGrantArrayOutput{})
	pulumi.RegisterOutputType(ClientGrantMapOutput{})
}
